package com.gopawpaw.erp.hibernate.a;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * AprmMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.a.AprmMstr
 * @author MyEclipse Persistence Tools
 */

public class AprmMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(AprmMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(AprmMstr transientInstance) {
		log.debug("saving AprmMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(AprmMstr persistentInstance) {
		log.debug("deleting AprmMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public AprmMstr findById(com.gopawpaw.erp.hibernate.a.AprmMstrId id) {
		log.debug("getting AprmMstr instance with id: " + id);
		try {
			AprmMstr instance = (AprmMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.a.AprmMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(AprmMstr instance) {
		log.debug("finding AprmMstr instance by example");
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
		log.debug("finding AprmMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from AprmMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all AprmMstr instances");
		try {
			String queryString = "from AprmMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public AprmMstr merge(AprmMstr detachedInstance) {
		log.debug("merging AprmMstr instance");
		try {
			AprmMstr result = (AprmMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(AprmMstr instance) {
		log.debug("attaching dirty AprmMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(AprmMstr instance) {
		log.debug("attaching clean AprmMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static AprmMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (AprmMstrDAO) ctx.getBean("AprmMstrDAO");
	}
}