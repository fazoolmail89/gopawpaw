package com.gopawpaw.erp.hibernate.v;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * VewMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.v.VewMstr
 * @author MyEclipse Persistence Tools
 */

public class VewMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(VewMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(VewMstr transientInstance) {
		log.debug("saving VewMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(VewMstr persistentInstance) {
		log.debug("deleting VewMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public VewMstr findById(com.gopawpaw.erp.hibernate.v.VewMstrId id) {
		log.debug("getting VewMstr instance with id: " + id);
		try {
			VewMstr instance = (VewMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.v.VewMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(VewMstr instance) {
		log.debug("finding VewMstr instance by example");
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
		log.debug("finding VewMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from VewMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all VewMstr instances");
		try {
			String queryString = "from VewMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public VewMstr merge(VewMstr detachedInstance) {
		log.debug("merging VewMstr instance");
		try {
			VewMstr result = (VewMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(VewMstr instance) {
		log.debug("attaching dirty VewMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(VewMstr instance) {
		log.debug("attaching clean VewMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static VewMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (VewMstrDAO) ctx.getBean("VewMstrDAO");
	}
}