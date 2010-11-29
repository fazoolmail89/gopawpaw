package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * ApmrMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.ApmrMstr
 * @author MyEclipse Persistence Tools
 */

public class ApmrMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ApmrMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(ApmrMstr transientInstance) {
		log.debug("saving ApmrMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ApmrMstr persistentInstance) {
		log.debug("deleting ApmrMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public ApmrMstr findById(com.gopawpaw.erp.hibernate.a.ApmrMstrId id) {
		log.debug("getting ApmrMstr instance with id: " + id);
		try {
			ApmrMstr instance = (ApmrMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.ApmrMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(ApmrMstr instance) {
		log.debug("finding ApmrMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding ApmrMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from ApmrMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all ApmrMstr instances");
		try {
			String queryString = "from ApmrMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public ApmrMstr merge(ApmrMstr detachedInstance) {
		log.debug("merging ApmrMstr instance");
		try {
			ApmrMstr result = (ApmrMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(ApmrMstr instance) {
		log.debug("attaching dirty ApmrMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(ApmrMstr instance) {
		log.debug("attaching clean ApmrMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ApmrMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ApmrMstrDAO) ctx.getBean("ApmrMstrDAO");
	}
}