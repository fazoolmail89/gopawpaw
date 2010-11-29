package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AscMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AscMstr
 * @author MyEclipse Persistence Tools
 */

public class AscMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AscMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AscMstr transientInstance) {
		log.debug("saving AscMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AscMstr persistentInstance) {
		log.debug("deleting AscMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AscMstr findById(com.gopawpaw.erp.hibernate.a.AscMstrId id) {
		log.debug("getting AscMstr instance with id: " + id);
		try {
			AscMstr instance = (AscMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AscMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AscMstr instance) {
		log.debug("finding AscMstr instance by example");
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
		log.debug("finding AscMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AscMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AscMstr instances");
		try {
			String queryString = "from AscMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AscMstr merge(AscMstr detachedInstance) {
		log.debug("merging AscMstr instance");
		try {
			AscMstr result = (AscMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AscMstr instance) {
		log.debug("attaching dirty AscMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AscMstr instance) {
		log.debug("attaching clean AscMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AscMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AscMstrDAO) ctx.getBean("AscMstrDAO");
	}
}